/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cassandra.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyDataCenterRequest extends RpcAcsRequest<ModifyDataCenterResponse> {
	   

	private String dataCenterId;

	private String clusterId;

	private String dataCenterName;
	public ModifyDataCenterRequest() {
		super("Cassandra", "2019-01-01", "ModifyDataCenter", "Cassandra");
		setMethod(MethodType.POST);
	}

	public String getDataCenterId() {
		return this.dataCenterId;
	}

	public void setDataCenterId(String dataCenterId) {
		this.dataCenterId = dataCenterId;
		if(dataCenterId != null){
			putQueryParameter("DataCenterId", dataCenterId);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getDataCenterName() {
		return this.dataCenterName;
	}

	public void setDataCenterName(String dataCenterName) {
		this.dataCenterName = dataCenterName;
		if(dataCenterName != null){
			putQueryParameter("DataCenterName", dataCenterName);
		}
	}

	@Override
	public Class<ModifyDataCenterResponse> getResponseClass() {
		return ModifyDataCenterResponse.class;
	}

}
