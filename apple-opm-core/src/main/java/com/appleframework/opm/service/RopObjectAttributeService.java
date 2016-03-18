package com.appleframework.opm.service;

import java.util.List;

import com.appleframework.opm.entity.RopObjectAttribute;

public interface RopObjectAttributeService {

    public List<RopObjectAttribute> findAllByObjectId(Long objectId);
        
}
