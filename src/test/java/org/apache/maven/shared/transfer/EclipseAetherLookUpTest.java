package org.apache.maven.shared.transfer;

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
        super.setUp();
        sonatypeRepoSystem = lookup( RepositorySystem.class );
        eclipseRepoSystem = lookup( org.eclipse.aether.RepositorySystem.class );
    }

    @Test
    public void testLookUpOrgEclipseAetherRepositorySystem()
    {
        Assert.assertNotNull( eclipseRepoSystem );
    }

    @Test
    public void testLookUpOrgSonatypeAetherRepositorySystem()
    {
        Assert.assertNotNull( sonatypeRepoSystem );
    }
}
