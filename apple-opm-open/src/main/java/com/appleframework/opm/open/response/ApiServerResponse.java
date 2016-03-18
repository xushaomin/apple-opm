package com.appleframework.opm.open.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.appleframework.opm.model.ApiBo;
import com.appleframework.opm.model.ServerBo;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "apiServerResponse")
public class ApiServerResponse{

    @XmlAttribute
    private ServerBo defaults;
    
    @XmlAttribute
    private List<ApiBo> apis;

	public ServerBo getDefaults() {
		return defaults;
	}

	public void setDefaults(ServerBo defaults) {
		this.defaults = defaults;
	}

	public List<ApiBo> getApis() {
		return apis;
	}

	public void setApis(List<ApiBo> apis) {
		this.apis = apis;
	}
    
}

