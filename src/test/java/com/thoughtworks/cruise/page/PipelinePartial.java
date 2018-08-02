/*************************GO-LICENSE-START*********************************
 * Copyright 2015 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *************************GO-LICENSE-END***********************************/

package com.thoughtworks.cruise.page;

//import org.openqa.selenium.By;

import com.thoughtworks.cruise.SahiBrowserWrapper;
import com.thoughtworks.cruise.state.ScenarioState;
import com.thoughtworks.cruise.utils.Assertions;
import com.thoughtworks.cruise.utils.Assertions.Function;
import com.thoughtworks.cruise.utils.Assertions.Predicate;
import com.thoughtworks.cruise.utils.Timeout;
import net.sf.sahi.client.Browser;
import net.sf.sahi.client.ElementStub;

public class PipelinePartial {

	private final ScenarioState scenarioState;

	public PipelinePartial(ScenarioState scenarioState) {
		this.scenarioState = scenarioState;
	}
	
	public void verifyCannotTriggerWithOptions(){

	}
	
	public void openTriggerWithOptions() {

	}

	private Boolean elementTriggerWithOptions() {

	}
}
