package br.com.devdojo.maratonajsf.bean.comunicacao;

import org.omnifaces.util.Faces;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Cookie;
import java.io.Serializable;
import java.net.URLDecoder;
import java.util.Map;


@Named
@ViewScoped
public class ComunicacaoTeste8Bean implements Serializable {

    private String key;
    private String value;

    public void init() {
        Map<String, Object> requestCookieMap = FacesContext.getCurrentInstance().getExternalContext().getRequestCookieMap();
        System.out.println(Faces.getRequestCookie("Nome"));
        Cookie cookie = (Cookie) requestCookieMap.get("Nome");
        String decode = null;
        try {
            decode = URLDecoder.decode(cookie.getValue(), "UTF-8");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(decode);
        System.out.println(requestCookieMap);
    }

    public String salvarCookie() {
        Faces.addResponseCookie(key, value, -1);
        return "comunication9?faces-redirect=true";
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
