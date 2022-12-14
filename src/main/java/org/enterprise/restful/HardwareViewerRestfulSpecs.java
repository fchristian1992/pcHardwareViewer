package org.enterprise.restful;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

// Defines the base URI
@ApplicationPath("/application")
// The java class declares root resource and provider classes
public class HardwareViewerRestfulSpecs extends Application {
    // Returns a non-empty collection with classes
    // Must be included in the published JAX-RS application
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();

        h.add(HardwareViewerRestful.class);
        return h;
    }
}
