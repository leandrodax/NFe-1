//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.24 at 04:53:17 PM BRST 
//


package br.inf.portalfiscal.nfe;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * Tipo Retorno do Pedido de  Consulta do Recido do Lote de Notas Fiscais Eletrônicas
 * 
 * <p>Java class for TRetConsReciNFe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRetConsReciNFe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/>
 *         &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/nfe}TVerAplic"/>
 *         &lt;element name="nRec" type="{http://www.portalfiscal.inf.br/nfe}TRec"/>
 *         &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/nfe}TStat"/>
 *         &lt;element name="xMotivo" type="{http://www.portalfiscal.inf.br/nfe}TMotivo"/>
 *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
 *         &lt;element name="dhRecbto" type="{http://www.portalfiscal.inf.br/nfe}TDateTimeUTC"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="cMsg">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;whiteSpace value="preserve"/>
 *                 &lt;pattern value="[0-9]{1,4}"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="xMsg">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString">
 *                 &lt;minLength value="1"/>
 *                 &lt;maxLength value="200"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/sequence>
 *         &lt;element name="protNFe" type="{http://www.portalfiscal.inf.br/nfe}TProtNFe" maxOccurs="50" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerNFe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRetConsReciNFe", propOrder = {
    "tpAmb",
    "verAplic",
    "nRec",
    "cStat",
    "xMotivo",
    "cuf",
    "dhRecbto",
    "cMsg",
    "xMsg",
    "protNFe"
})
@Entity(name = "TRetConsReciNFe")
@Table(name = "TRETCONSRECINFE")
@Inheritance(strategy = InheritanceType.JOINED)
public class TRetConsReciNFe
    implements Equals, HashCode
{

    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(required = true)
    protected String verAplic;
    @XmlElement(required = true)
    protected String nRec;
    @XmlElement(required = true)
    protected String cStat;
    @XmlElement(required = true)
    protected String xMotivo;
    @XmlElement(name = "cUF", required = true)
    protected String cuf;
    @XmlElement(required = true)
    protected String dhRecbto;
    protected String cMsg;
    protected String xMsg;
    protected List<TProtNFe> protNFe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the tpAmb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TPAMB", length = 255)
    public String getTpAmb() {
        return tpAmb;
    }

    /**
     * Sets the value of the tpAmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpAmb(String value) {
        this.tpAmb = value;
    }

    /**
     * Gets the value of the verAplic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "VERAPLIC", length = 20)
    public String getVerAplic() {
        return verAplic;
    }

    /**
     * Sets the value of the verAplic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerAplic(String value) {
        this.verAplic = value;
    }

    /**
     * Gets the value of the nRec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NREC", length = 15)
    public String getNRec() {
        return nRec;
    }

    /**
     * Sets the value of the nRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRec(String value) {
        this.nRec = value;
    }

    /**
     * Gets the value of the cStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CSTAT", length = 3)
    public String getCStat() {
        return cStat;
    }

    /**
     * Sets the value of the cStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCStat(String value) {
        this.cStat = value;
    }

    /**
     * Gets the value of the xMotivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "XMOTIVO", length = 255)
    public String getXMotivo() {
        return xMotivo;
    }

    /**
     * Sets the value of the xMotivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMotivo(String value) {
        this.xMotivo = value;
    }

    /**
     * Gets the value of the cuf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CUF", length = 255)
    public String getCUF() {
        return cuf;
    }

    /**
     * Sets the value of the cuf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUF(String value) {
        this.cuf = value;
    }

    /**
     * Gets the value of the dhRecbto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DHRECBTO", length = 255)
    public String getDhRecbto() {
        return dhRecbto;
    }

    /**
     * Sets the value of the dhRecbto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhRecbto(String value) {
        this.dhRecbto = value;
    }

    /**
     * Gets the value of the cMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CMSG")
    public String getCMsg() {
        return cMsg;
    }

    /**
     * Sets the value of the cMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMsg(String value) {
        this.cMsg = value;
    }

    /**
     * Gets the value of the xMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "XMSG", length = 200)
    public String getXMsg() {
        return xMsg;
    }

    /**
     * Sets the value of the xMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMsg(String value) {
        this.xMsg = value;
    }

    /**
     * Gets the value of the protNFe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protNFe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtNFe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TProtNFe }
     * 
     * 
     */
    @OneToMany(targetEntity = TProtNFe.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROTNFE_TRETCONSRECINFE_HJID")
    public List<TProtNFe> getProtNFe() {
        if (protNFe == null) {
            protNFe = new ArrayList<TProtNFe>();
        }
        return this.protNFe;
    }

    /**
     * 
     * 
     */
    public void setProtNFe(List<TProtNFe> protNFe) {
        this.protNFe = protNFe;
    }

    /**
     * Gets the value of the versao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "VERSAO", length = 255)
    public String getVersao() {
        return versao;
    }

    /**
     * Sets the value of the versao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TRetConsReciNFe)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TRetConsReciNFe that = ((TRetConsReciNFe) object);
        {
            String lhsTpAmb;
            lhsTpAmb = this.getTpAmb();
            String rhsTpAmb;
            rhsTpAmb = that.getTpAmb();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tpAmb", lhsTpAmb), LocatorUtils.property(thatLocator, "tpAmb", rhsTpAmb), lhsTpAmb, rhsTpAmb)) {
                return false;
            }
        }
        {
            String lhsVerAplic;
            lhsVerAplic = this.getVerAplic();
            String rhsVerAplic;
            rhsVerAplic = that.getVerAplic();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "verAplic", lhsVerAplic), LocatorUtils.property(thatLocator, "verAplic", rhsVerAplic), lhsVerAplic, rhsVerAplic)) {
                return false;
            }
        }
        {
            String lhsNRec;
            lhsNRec = this.getNRec();
            String rhsNRec;
            rhsNRec = that.getNRec();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nRec", lhsNRec), LocatorUtils.property(thatLocator, "nRec", rhsNRec), lhsNRec, rhsNRec)) {
                return false;
            }
        }
        {
            String lhsCStat;
            lhsCStat = this.getCStat();
            String rhsCStat;
            rhsCStat = that.getCStat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cStat", lhsCStat), LocatorUtils.property(thatLocator, "cStat", rhsCStat), lhsCStat, rhsCStat)) {
                return false;
            }
        }
        {
            String lhsXMotivo;
            lhsXMotivo = this.getXMotivo();
            String rhsXMotivo;
            rhsXMotivo = that.getXMotivo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xMotivo", lhsXMotivo), LocatorUtils.property(thatLocator, "xMotivo", rhsXMotivo), lhsXMotivo, rhsXMotivo)) {
                return false;
            }
        }
        {
            String lhsCUF;
            lhsCUF = this.getCUF();
            String rhsCUF;
            rhsCUF = that.getCUF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cuf", lhsCUF), LocatorUtils.property(thatLocator, "cuf", rhsCUF), lhsCUF, rhsCUF)) {
                return false;
            }
        }
        {
            String lhsDhRecbto;
            lhsDhRecbto = this.getDhRecbto();
            String rhsDhRecbto;
            rhsDhRecbto = that.getDhRecbto();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dhRecbto", lhsDhRecbto), LocatorUtils.property(thatLocator, "dhRecbto", rhsDhRecbto), lhsDhRecbto, rhsDhRecbto)) {
                return false;
            }
        }
        {
            String lhsCMsg;
            lhsCMsg = this.getCMsg();
            String rhsCMsg;
            rhsCMsg = that.getCMsg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cMsg", lhsCMsg), LocatorUtils.property(thatLocator, "cMsg", rhsCMsg), lhsCMsg, rhsCMsg)) {
                return false;
            }
        }
        {
            String lhsXMsg;
            lhsXMsg = this.getXMsg();
            String rhsXMsg;
            rhsXMsg = that.getXMsg();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "xMsg", lhsXMsg), LocatorUtils.property(thatLocator, "xMsg", rhsXMsg), lhsXMsg, rhsXMsg)) {
                return false;
            }
        }
        {
            List<TProtNFe> lhsProtNFe;
            lhsProtNFe = (((this.protNFe!= null)&&(!this.protNFe.isEmpty()))?this.getProtNFe():null);
            List<TProtNFe> rhsProtNFe;
            rhsProtNFe = (((that.protNFe!= null)&&(!that.protNFe.isEmpty()))?that.getProtNFe():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "protNFe", lhsProtNFe), LocatorUtils.property(thatLocator, "protNFe", rhsProtNFe), lhsProtNFe, rhsProtNFe)) {
                return false;
            }
        }
        {
            String lhsVersao;
            lhsVersao = this.getVersao();
            String rhsVersao;
            rhsVersao = that.getVersao();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "versao", lhsVersao), LocatorUtils.property(thatLocator, "versao", rhsVersao), lhsVersao, rhsVersao)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theTpAmb;
            theTpAmb = this.getTpAmb();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tpAmb", theTpAmb), currentHashCode, theTpAmb);
        }
        {
            String theVerAplic;
            theVerAplic = this.getVerAplic();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "verAplic", theVerAplic), currentHashCode, theVerAplic);
        }
        {
            String theNRec;
            theNRec = this.getNRec();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nRec", theNRec), currentHashCode, theNRec);
        }
        {
            String theCStat;
            theCStat = this.getCStat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cStat", theCStat), currentHashCode, theCStat);
        }
        {
            String theXMotivo;
            theXMotivo = this.getXMotivo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xMotivo", theXMotivo), currentHashCode, theXMotivo);
        }
        {
            String theCUF;
            theCUF = this.getCUF();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cuf", theCUF), currentHashCode, theCUF);
        }
        {
            String theDhRecbto;
            theDhRecbto = this.getDhRecbto();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dhRecbto", theDhRecbto), currentHashCode, theDhRecbto);
        }
        {
            String theCMsg;
            theCMsg = this.getCMsg();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cMsg", theCMsg), currentHashCode, theCMsg);
        }
        {
            String theXMsg;
            theXMsg = this.getXMsg();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "xMsg", theXMsg), currentHashCode, theXMsg);
        }
        {
            List<TProtNFe> theProtNFe;
            theProtNFe = (((this.protNFe!= null)&&(!this.protNFe.isEmpty()))?this.getProtNFe():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "protNFe", theProtNFe), currentHashCode, theProtNFe);
        }
        {
            String theVersao;
            theVersao = this.getVersao();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "versao", theVersao), currentHashCode, theVersao);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
