/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.example.servicebuilder.extdb.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the UserLogin service. Represents a row in the &quot;ExtDB_UserLogin&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.example.servicebuilder.extdb.model.impl.UserLoginModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.example.servicebuilder.extdb.model.impl.UserLoginImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserLogin
 * @generated
 */
@ProviderType
public interface UserLoginModel extends BaseModel<UserLogin> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a user login model instance should use the {@link UserLogin} interface instead.
	 */

	/**
	 * Returns the primary key of this user login.
	 *
	 * @return the primary key of this user login
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this user login.
	 *
	 * @param primaryKey the primary key of this user login
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the uuid of this user login.
	 *
	 * @return the uuid of this user login
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this user login.
	 *
	 * @param uuid the uuid of this user login
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the screen name of this user login.
	 *
	 * @return the screen name of this user login
	 */
	@AutoEscape
	public String getScreenName();

	/**
	 * Sets the screen name of this user login.
	 *
	 * @param screenName the screen name of this user login
	 */
	public void setScreenName(String screenName);

	/**
	 * Returns the system name of this user login.
	 *
	 * @return the system name of this user login
	 */
	@AutoEscape
	public String getSystemName();

	/**
	 * Sets the system name of this user login.
	 *
	 * @param systemName the system name of this user login
	 */
	public void setSystemName(String systemName);

	/**
	 * Returns the last login of this user login.
	 *
	 * @return the last login of this user login
	 */
	public Date getLastLogin();

	/**
	 * Sets the last login of this user login.
	 *
	 * @param lastLogin the last login of this user login
	 */
	public void setLastLogin(Date lastLogin);

	/**
	 * Returns the total logins of this user login.
	 *
	 * @return the total logins of this user login
	 */
	public long getTotalLogins();

	/**
	 * Sets the total logins of this user login.
	 *
	 * @param totalLogins the total logins of this user login
	 */
	public void setTotalLogins(long totalLogins);

	/**
	 * Returns the longest time between logins of this user login.
	 *
	 * @return the longest time between logins of this user login
	 */
	public long getLongestTimeBetweenLogins();

	/**
	 * Sets the longest time between logins of this user login.
	 *
	 * @param longestTimeBetweenLogins the longest time between logins of this user login
	 */
	public void setLongestTimeBetweenLogins(long longestTimeBetweenLogins);

	/**
	 * Returns the shortest time between logins of this user login.
	 *
	 * @return the shortest time between logins of this user login
	 */
	public long getShortestTimeBetweenLogins();

	/**
	 * Sets the shortest time between logins of this user login.
	 *
	 * @param shortestTimeBetweenLogins the shortest time between logins of this user login
	 */
	public void setShortestTimeBetweenLogins(long shortestTimeBetweenLogins);

}