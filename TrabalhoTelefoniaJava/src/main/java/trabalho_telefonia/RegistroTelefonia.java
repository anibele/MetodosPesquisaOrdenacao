/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho_telefonia;

/**
 *
 * @author gusta
 */
public class RegistroTelefonia {
    private String session_id;
    private String imsi;
    private String imei;
    private String mcc;
    private String mnc;
    private int cell_id;
    private int lac;
    private String bearer;
    private String start_time;
    private String end_time;
    private int duration_s;
    private String ip_addr;
    private String sip_call_id;
    private String codec;
    private String bytes_up;
    private String bytes_down;
    private double lat;
    private double lon;
    private String encryption;
    
    public RegistroTelefonia() {
    
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getMnc() {
        return mnc;
    }

    public void setMnc(String mnc) {
        this.mnc = mnc;
    }

    public int getCell_id() {
        return cell_id;
    }

    public void setCell_id(int cell_id) {
        this.cell_id = cell_id;
    }

    public int getLac() {
        return lac;
    }

    public void setLac(int lac) {
        this.lac = lac;
    }

    public String getBearer() {
        return bearer;
    }

    public void setBearer(String bearer) {
        this.bearer = bearer;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public int getDuration_s() {
        return duration_s;
    }

    public void setDuration_s(int duration_s) {
        this.duration_s = duration_s;
    }

    public String getIp_addr() {
        return ip_addr;
    }

    public void setIp_addr(String ip_addr) {
        this.ip_addr = ip_addr;
    }

    public String getSip_call_id() {
        return sip_call_id;
    }

    public void setSip_call_id(String sip_call_id) {
        this.sip_call_id = sip_call_id;
    }

    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    public String getBytes_up() {
        return bytes_up;
    }

    public void setBytes_up(String bytes_up) {
        this.bytes_up = bytes_up;
    }

    public String getBytes_down() {
        return bytes_down;
    }

    public void setBytes_down(String bytes_down) {
        this.bytes_down = bytes_down;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public String getEncryption() {
        return encryption;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }
    
    
    
}
