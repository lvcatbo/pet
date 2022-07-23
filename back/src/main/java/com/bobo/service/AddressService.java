package com.bobo.service;

import com.bobo.dao.AddressMapper;
import com.bobo.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressMapper addressMapper;

    public void detAddress(Integer id){addressMapper.detAddress(id);}

    public List<Address> getAddress(Integer uid){return addressMapper.getAddress(uid);}

    public Address getAddressById(Integer id){return addressMapper.getAddressById(id);}

    public void addAddress(Integer uid,String name,String address,String tel){addressMapper.addAddress(uid,name,address,tel);}

    public void editAddress(String name,String address,String tel,Integer id){addressMapper.editAddress(name,address,tel,id);}
}
