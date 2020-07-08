package org.apache.maven.shared.transfer;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.codehaus.plexus.PlexusTestCase;
import org.junit.Assert;
import org.junit.Test;
import org.sonatype.aether.RepositorySystem;

public class EclipseAetherLookUpTest extends PlexusTestCase
{
    private RepositorySystem sonatypeRepoSystem;
    private org.eclipse.aether.RepositorySystem eclipseRepoSystem;

    @Override
    public void setUp() throws Exception
    {
        /*super.setUp();
        // sonatypeRepoSystem = lookup( RepositorySystem.class );
        eclipseRepoSystem = lookup( org.eclipse.aether.RepositorySystem.class );*/
    }

    @Test
    public void testLookUpOrgEclipseAetherRepositorySystem()
    {
        /*Assert.assertNotNull( eclipseRepoSystem );*/
    }

    @Test
    public void testLookUpOrgSonatypeAetherRepositorySystem()
    {
        /*Assert.assertNotNull( sonatypeRepoSystem );*/
    }
}
