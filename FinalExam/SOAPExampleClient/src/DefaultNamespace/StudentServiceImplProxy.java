package DefaultNamespace;

public class StudentServiceImplProxy implements DefaultNamespace.StudentServiceImpl {
  private String _endpoint = null;
  private DefaultNamespace.StudentServiceImpl studentServiceImpl = null;
  
  public StudentServiceImplProxy() {
    _initStudentServiceImplProxy();
  }
  
  public StudentServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initStudentServiceImplProxy();
  }
  
  private void _initStudentServiceImplProxy() {
    try {
      studentServiceImpl = (new DefaultNamespace.StudentServiceImplServiceLocator()).getStudentServiceImpl();
      if (studentServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)studentServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)studentServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (studentServiceImpl != null)
      ((javax.xml.rpc.Stub)studentServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.StudentServiceImpl getStudentServiceImpl() {
    if (studentServiceImpl == null)
      _initStudentServiceImplProxy();
    return studentServiceImpl;
  }
  
  public java.lang.String getStudentName(java.lang.String sName) throws java.rmi.RemoteException{
    if (studentServiceImpl == null)
      _initStudentServiceImplProxy();
    return studentServiceImpl.getStudentName(sName);
  }
  
  
}