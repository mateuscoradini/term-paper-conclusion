package br.com.findplaces.model.to;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="type")
public class UserTypeTO implements Serializable {
	
	public static final Long USER_FB_ID = 1L;
	public static final Long USER_EMAIL = 2L;
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String name;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}