package com.mr.jsf.example.util;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class AppUrlStore implements Serializable {
	private static final long serialVersionUID = 1L;

	private String baseUrl = null;
	private String simpleCrudUrl = null;

	public String getBaseUrl() {return baseUrl; }
	public String getSimpleCrudUrl() { return simpleCrudUrl; }

	@PostConstruct
    public void init() {

		this.baseUrl = "welcome.xhtml";
		this.simpleCrudUrl = "simplecrud.xhtml";
    }


}
