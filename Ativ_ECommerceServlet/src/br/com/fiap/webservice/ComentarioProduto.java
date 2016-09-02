package br.com.fiap.webservice;

import java.util.Calendar;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;

public class ComentarioProduto {

	    private String assunto;

	    private Integer avaliacao;

	    private String comentario;

	    private Calendar data;

	    private Integer id;

	    private java.lang.String titulo;

	    public ComentarioProduto() {
	    }

	    public ComentarioProduto(
	           String assunto,
	           Integer avaliacao,
	           String comentario,
	           Calendar data,
	           Integer id,
	           String titulo) {
	           this.assunto = assunto;
	           this.avaliacao = avaliacao;
	           this.comentario = comentario;
	           this.data = data;
	           this.id = id;
	           this.titulo = titulo;
	    }
	
	    public String getAssunto() {
	        return assunto;
	    }
	 
	    public void setAssunto(java.lang.String assunto) {
	        this.assunto = assunto;
	    }
	
	    public java.lang.Integer getAvaliacao() {
	        return avaliacao;
	    }

	    public void setAvaliacao(java.lang.Integer avaliacao) {
	        this.avaliacao = avaliacao;
	    }
	  
	    public java.lang.String getComentarioProduto() {
	        return comentario;
	    }

	    public void setComentarioProduto(java.lang.String comentario) {
	        this.comentario = comentario;
	    }
	 
	    public java.util.Calendar getData() {
	        return data;
	    }

	    public void setData(java.util.Calendar data) {
	        this.data = data;
	    }

	    public java.lang.Integer getId() {
	        return id;
	    }

	    public void setId(java.lang.Integer id) {
	        this.id = id;
	    }

	    public java.lang.String getTitulo() {
	        return titulo;
	    }
	   
	    public void setTitulo(java.lang.String titulo) {
	        this.titulo = titulo;
	    }

	    private Object equalsCalc = null;
	    public synchronized boolean equals(Object obj) {
	        if (!(obj instanceof ComentarioProduto)) return false;
	        ComentarioProduto other = (ComentarioProduto) obj;
	        if (obj == null) return false;
	        if (this == obj) return true;
	        if (equalsCalc != null) {
	            return (equalsCalc == obj);
	        }
	        equalsCalc = obj;
	        boolean equals;
	        equals = true && 
	            ((this.assunto==null && other.getAssunto()==null) || 
	             (this.assunto!=null &&
	              this.assunto.equals(other.getAssunto()))) &&
	            ((this.avaliacao==null && other.getAvaliacao()==null) || 
	             (this.avaliacao!=null &&
	              this.avaliacao.equals(other.getAvaliacao()))) &&
	            ((this.comentario==null && other.getComentarioProduto()==null) || 
	             (this.comentario!=null &&
	              this.comentario.equals(other.getComentarioProduto()))) &&
	            ((this.data==null && other.getData()==null) || 
	             (this.data!=null &&
	              this.data.equals(other.getData()))) &&
	            ((this.id==null && other.getId()==null) || 
	             (this.id!=null &&
	              this.id.equals(other.getId()))) &&
	            ((this.titulo==null && other.getTitulo()==null) || 
	             (this.titulo!=null &&
	              this.titulo.equals(other.getTitulo())));
	        equalsCalc = null;
	        return equals;
	    }

	    private boolean hashCodeCalc = false;
	    public synchronized int hashCode() {
	        if (hashCodeCalc) {
	            return 0;
	        }
	        hashCodeCalc = true;
	        int hashCode = 1;
	        if (getAssunto() != null) {
	            hashCode += getAssunto().hashCode();
	        }
	        if (getAvaliacao() != null) {
	            hashCode += getAvaliacao().hashCode();
	        }
	        if (getComentarioProduto() != null) {
	            hashCode += getComentarioProduto().hashCode();
	        }
	        if (getData() != null) {
	            hashCode += getData().hashCode();
	        }
	        if (getId() != null) {
	            hashCode += getId().hashCode();
	        }
	        if (getTitulo() != null) {
	            hashCode += getTitulo().hashCode();
	        }
	        hashCodeCalc = false;
	        return hashCode;
	    }

	    // Type metadata
	    private static TypeDesc typeDesc =
	        new TypeDesc(ComentarioProduto.class, true);

	    static {
	        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.fiap.com.br/", "comentario"));
	        ElementDesc elemField = new ElementDesc();
	        elemField.setFieldName("assunto");
	        elemField.setXmlName(new javax.xml.namespace.QName("", "assunto"));
	        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
	        elemField.setMinOccurs(0);
	        elemField.setNillable(false);
	        typeDesc.addFieldDesc(elemField);
	        elemField = new ElementDesc();
	        elemField.setFieldName("avaliacao");
	        elemField.setXmlName(new javax.xml.namespace.QName("", "avaliacao"));
	        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
	        elemField.setMinOccurs(0);
	        elemField.setNillable(false);
	        typeDesc.addFieldDesc(elemField);
	        elemField = new ElementDesc();
	        elemField.setFieldName("comentario");
	        elemField.setXmlName(new javax.xml.namespace.QName("", "comentario"));
	        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
	        elemField.setMinOccurs(0);
	        elemField.setNillable(false);
	        typeDesc.addFieldDesc(elemField);
	        elemField = new ElementDesc();
	        elemField.setFieldName("data");
	        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
	        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
	        elemField.setMinOccurs(0);
	        elemField.setNillable(false);
	        typeDesc.addFieldDesc(elemField);
	        elemField = new ElementDesc();
	        elemField.setFieldName("id");
	        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
	        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
	        elemField.setMinOccurs(0);
	        elemField.setNillable(false);
	        typeDesc.addFieldDesc(elemField);
	        elemField = new ElementDesc();
	        elemField.setFieldName("titulo");
	        elemField.setXmlName(new javax.xml.namespace.QName("", "titulo"));
	        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
	        elemField.setMinOccurs(0);
	        elemField.setNillable(false);
	        typeDesc.addFieldDesc(elemField);
	    }

	    /**
	     * Return type metadata object
	     */
	    public static org.apache.axis.description.TypeDesc getTypeDesc() {
	        return typeDesc;
	    }

	    /**
	     * Get Custom Serializer
	     */
	    public static org.apache.axis.encoding.Serializer getSerializer(
	           java.lang.String mechType, 
	           java.lang.Class _javaType,  
	           javax.xml.namespace.QName _xmlType) {
	        return 
	          new  org.apache.axis.encoding.ser.BeanSerializer(
	            _javaType, _xmlType, typeDesc);
	    }

	    /**
	     * Get Custom Deserializer
	     */
	    public static org.apache.axis.encoding.Deserializer getDeserializer(
	           java.lang.String mechType, 
	           java.lang.Class _javaType,  
	           javax.xml.namespace.QName _xmlType) {
	        return 
	          new  org.apache.axis.encoding.ser.BeanDeserializer(
	            _javaType, _xmlType, typeDesc);
	    }

	
}
