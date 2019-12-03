package com.virtusa.travelline.dao;

import com.virtusa.travelline.model.AccountHolder;
import com.virtusa.travelline.model.Login;
import com.virtusa.travelline.model.ServiceProvider;

public interface LoginDAO {
	AccountHolder accountHolderValidate(Login login);
	ServiceProvider serviceProviderValidate(Login login);

}
