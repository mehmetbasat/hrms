

package project.hrms.core.adapters.MernisServiceReference;
//------------------------------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 9.0.0.0
//
// Created by Quasar Development 
//
// This class has been generated for test purposes only and cannot be used in any commercial project.
// To use it in commercial project, you need to generate this class again with Premium account.
// Check https://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
//
// Licence: D5BE7513681F1DD3A49F6F2224FF761614E01F75DF84A5237FFCB580C2100F2FD6B3D2E5CAA8F81376163A7C93B588EDFA6AFC9A122C3FE14A58F30C070592BD
//------------------------------------------------------------------------

public class NCEBinaryObject implements java.io.Serializable
{
    private byte[] _bytes = null;    
    private transient java.io.InputStream _stream = null;

    private String _contentType = null;

    public NCEBinaryObject(byte[] bytes) {
        _bytes = bytes;
    }

    public NCEBinaryObject(java.io.InputStream stream) {
        _stream = stream;
    }
    
    public Object getUnderlayingObject()
    {
        if (_bytes != null)
            return _bytes;
        else if (_stream != null)
            return _stream;
        else 
            return null;
    }
    
    public java.io.InputStream getStream()
    {
        return _stream;
    }
    
    public byte[] getBytes() {
        return _bytes;
    }

    public void setBytes(byte[] bytes) {
        this._bytes = bytes;
    }

    public String getContentType() {
        return _contentType;
    }

    public void setContentType(String contentType) {
        this._contentType = contentType;
    }
}