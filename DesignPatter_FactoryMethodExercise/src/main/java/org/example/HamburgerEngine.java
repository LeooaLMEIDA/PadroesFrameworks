package org.example;

import java.util.Map;

public interface HamburgerEngine {
    String render(String viewName, Map<String, Object> context);
}
