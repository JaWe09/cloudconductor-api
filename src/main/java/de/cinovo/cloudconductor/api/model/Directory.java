package de.cinovo.cloudconductor.api.model;

/*
 * #%L
 * cloudconductor-api
 * %%
 * Copyright (C) 2013 - 2014 Cinovo AG
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Set;

/**
 * Copyright 2013 Cinovo AG<br>
 * <br>
 * 
 * @author psigloch
 * 
 */
public class Directory implements INamed {

	private String name;
	private String pkg;
	private String targetPath;
	private String owner;
	private String group;
	private String fileMode;
	private Set<String> dependentServices;


	/**
	 * Class constructor.
	 *
	 * @param name the name of the file
	 * @param pkg the package dependency
	 * @param targetPath the target path of the file
	 * @param owner the owner of the file
	 * @param group the group of the file
	 * @param fileMode the file mode
	 * @param dependentServices the init scripts of the services that depend on this configuration file (may not always be provided)
	 */
	@JsonCreator
	public Directory(@JsonProperty("name") String name, @JsonProperty("pkg") String pkg, @JsonProperty("targetPath") String targetPath, @JsonProperty("owner") String owner, @JsonProperty("group") String group, @JsonProperty("fileMode") String fileMode, @JsonProperty("dependentServices") Set<String> dependentServices) {
		this.name = name;
		this.pkg = pkg;
		this.targetPath = targetPath;
		this.owner = owner;
		this.group = group;
		this.fileMode = fileMode;
		this.dependentServices = dependentServices;
	}
	
	/**
	 * @return the name
	 */
	@Override
	public String getName() {
		return this.name;
	}
	
	/**
	 * @return the targetPath
	 */
	public String getTargetPath() {
		return this.targetPath;
	}
	
	/**
	 * @return the owner
	 */
	public String getOwner() {
		return this.owner;
	}
	
	/**
	 * @return the group
	 */
	public String getGroup() {
		return this.group;
	}
	
	/**
	 * @return the fileMode
	 */
	public String getFileMode() {
		return this.fileMode;
	}
	
	/**
	 * @return the pkg
	 */
	public String getPkg() {
		return this.pkg;
	}
	
	/**
	 * @return the dependentServices
	 */
	public Set<String> getDependentServices() {
		return this.dependentServices;
	}
	
}
