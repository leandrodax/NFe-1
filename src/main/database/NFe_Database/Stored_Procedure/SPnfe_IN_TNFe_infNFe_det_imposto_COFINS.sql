USE [nfe] 
GO
SET ANSI_NULLS ON 
GO
SET QUOTED_IDENTIFIER ON 
GO
IF EXISTS(SELECT 1 FROM SYSOBJECTS WHERE ID = OBJECT_ID('SPnfe_IN_TNFe_infNFe_det_imposto_COFINS'))
BEGIN
    DROP PROCEDURE SPnfe_IN_TNFe_infNFe_det_imposto_COFINS
END
GO
/********************************************************************************************************************** 
 Objetivo..........: Inserir dados da NFe referente ao bloco de COFINS
 Parâmetros........: Nenhum
 Autor.............: Fernando Souza
 Criação...........: 13/10/2017 
 Versão............: {01.00} 
 ----------------------------------------------------------------------------------------------------------------------            
 Alteração......... :
 Responsável....... :          
 Motivo............ :   
 **********************************************************************************************************************/ 
CREATE PROCEDURE dbo.SPnfe_IN_TNFe_infNFe_det_imposto_COFINS ( @Id_Arquivo    BIGINT
                                                            , @Tp_COFINS    VARCHAR (10) 
                                                            , @CST           CHAR (2) 
                                                            , @vBC           DECIMAL (15,2)
                                                            , @pCOFINS       DECIMAL (7,4)
                                                            , @vCOFINS       DECIMAL (15,2)
                                                            , @qBCProd       DECIMAL (16,4)
                                                            , @vAliqProd     DECIMAL (15,5)  ) 

AS 
BEGIN 

        SET NOCOUNT ON 
        
        DECLARE @COD_ERRO            INT         -- VARIÁVEL COM O RETORNO DE ERRO   
              , @DESC_ERRO           VARCHAR(800)-- VARIÁVEL COM A DESCRICAO DO ERRO   
              , @INT_RET_PROC        INT         -- VARIÁVEL COM O CÓDIGO DE RETORNO DE ERRO DE PROCS  
        

		-- Recupera o código da empresa com base no Id do arquivo recebido
		DECLARE @Id_Empresa INT
		Set @Id_Empresa = (Select top 1 Id_Empresa
							 from dbo.TSS_Arquivo with (nolock)
						    where Id_Arquivo = @Id_Arquivo)
		
        IF isnull(@Id_Empresa, 0) != 0 BEGIN   
            SET @DESC_ERRO = 'Não foi encontrado nenhuma empresa associado ao arquivo.'   
            GOTO TRATA_ERRO   
        END  

        INSERT INTO dbo.TNFe_infNFe_det_imposto_COFINS 
                  ( Id_Arquivo
                  , Id_Empresa
                  , Tp_COFINS
                  , CST
                  , vBC
                  , pCOFINS
                  , vCOFINS
                  , qBCProd
                  , vAliqProd     
                  , Dt_Inclusao )
           VALUES ( @Id_Arquivo  
                  , @Id_Empresa  
                  , @Tp_COFINS
                  , @CST
                  , @vBC
                  , @pCOFINS
                  , @vCOFINS
                  , @qBCProd
                  , @vAliqProd  
                  , getdate() )

        SET @COD_ERRO = @@ERROR   
        IF @COD_ERRO != 0 BEGIN   
            SET @DESC_ERRO = 'ERRO AO INSERIR AS INFORMACOES da NFe referente a COFINS'   
            GOTO TRATA_ERRO   
        END

   RETURN       
      
TRATA_ERRO:       

   SET @DESC_ERRO = '**SPnfe_IN_TNFe_infNFe_det_imposto_COFINS** - ' + @DESC_ERRO       
   RAISERROR (@DESC_ERRO,16,1)       
   RETURN @COD_ERRO + @INT_RET_PROC       
END    
