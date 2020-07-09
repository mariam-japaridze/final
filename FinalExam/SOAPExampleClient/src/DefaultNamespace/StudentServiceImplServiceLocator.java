/**
 * StudentServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class StudentServiceImplServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.StudentServiceImplService {

    public StudentServiceImplServiceLocator() {
    }


    public StudentServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StudentServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StudentServiceImpl
    private java.lang.String StudentServiceImpl_address = "http://localhost:8080/Quiz4_SOAP/services/StudentServiceImpl";

    public java.lang.String getStudentServiceImplAddress() {
        return StudentServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StudentServiceImplWSDDServiceName = "StudentServiceImpl";

    public java.lang.String getStudentServiceImplWSDDServiceName() {
        return StudentServiceImplWSDDServiceName;
    }

    public void setStudentServiceImplWSDDServiceName(java.lang.String name) {
        StudentServiceImplWSDDServiceName = name;
    }

    public DefaultNamespace.StudentServiceImpl getStudentServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StudentServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStudentServiceImpl(endpoint);
    }

    public DefaultNamespace.StudentServiceImpl getStudentServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.StudentServiceImplSoapBindingStub _stub = new DefaultNamespace.StudentServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getStudentServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStudentServiceImplEndpointAddress(java.lang.String address) {
        StudentServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.StudentServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.StudentServiceImplSoapBindingStub _stub = new DefaultNamespace.StudentServiceImplSoapBindingStub(new java.net.URL(StudentServiceImpl_address), this);
                _stub.setPortName(getStudentServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("StudentServiceImpl".equals(inputPortName)) {
            return getStudentServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "StudentServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "StudentServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StudentServiceImpl".equals(portName)) {
            setStudentServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
