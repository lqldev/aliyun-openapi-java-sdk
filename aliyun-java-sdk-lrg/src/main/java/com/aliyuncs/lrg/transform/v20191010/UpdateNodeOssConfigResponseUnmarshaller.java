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

package com.aliyuncs.lrg.transform.v20191010;

import com.aliyuncs.lrg.model.v20191010.UpdateNodeOssConfigResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateNodeOssConfigResponseUnmarshaller {

	public static UpdateNodeOssConfigResponse unmarshall(UpdateNodeOssConfigResponse updateNodeOssConfigResponse, UnmarshallerContext _ctx) {
		
		updateNodeOssConfigResponse.setCode(_ctx.integerValue("UpdateNodeOssConfigResponse.code"));
		updateNodeOssConfigResponse.setData(_ctx.mapValue("UpdateNodeOssConfigResponse.data"));
		updateNodeOssConfigResponse.setMessage(_ctx.stringValue("UpdateNodeOssConfigResponse.message"));
		updateNodeOssConfigResponse.setSuccess(_ctx.booleanValue("UpdateNodeOssConfigResponse.success"));
	 
	 	return updateNodeOssConfigResponse;
	}
}