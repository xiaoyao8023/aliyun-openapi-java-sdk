/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.itaas.model.v20170505;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RemoveIPSegmentRequest extends RpcAcsRequest<RemoveIPSegmentResponse> {
	
	public RemoveIPSegmentRequest() {
		super("ITaaS", "2017-05-05", "RemoveIPSegment");
	}

	private String sysfrom;

	private String operator;

	private String clientappid;

	private String uuid;

	public String getSysfrom() {
		return this.sysfrom;
	}

	public void setSysfrom(String sysfrom) {
		this.sysfrom = sysfrom;
		putQueryParameter("Sysfrom", sysfrom);
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		putQueryParameter("Operator", operator);
	}

	public String getClientappid() {
		return this.clientappid;
	}

	public void setClientappid(String clientappid) {
		this.clientappid = clientappid;
		putQueryParameter("Clientappid", clientappid);
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		putQueryParameter("Uuid", uuid);
	}

	@Override
	public Class<RemoveIPSegmentResponse> getResponseClass() {
		return RemoveIPSegmentResponse.class;
	}

}
