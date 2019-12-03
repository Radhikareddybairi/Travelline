package com.virtusa.travelline.service;

import com.virtusa.travelline.model.AccountHolder;
import com.virtusa.travelline.model.Login;
import com.virtusa.travelline.model.ServiceProvider;

public interface LoginService {
	AccountHolder accountHolderValidate(Login login);
	ServiceProvider serviceProviderValidate(Login login);


}
