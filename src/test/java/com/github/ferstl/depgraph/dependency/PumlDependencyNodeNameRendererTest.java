/*
 * Copyright (c) 2014 - 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.ferstl.depgraph.dependency;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PumlDependencyNodeNameRendererTest {


  private final PumlDependencyNodeNameRenderer renderer = new PumlDependencyNodeNameRenderer(true, true,false, false,  true);

  @Test
  public void testRenderCompileNode() throws Exception {

    final DependencyNode dependencyNode = DependencyNodeUtil.createDependencyNode("org.springframework",
        "spring-context", "4.3.9.RELEASE");

    String nodeInfo = this.renderer.render(dependencyNode);

    assertEquals("{\"component\":\"rectangle\",\"label\":\"org.springframework:spring-context:4.3.9.RELEASE\",\"stereotype\":\"compile\"}",
        nodeInfo);

  }
}
