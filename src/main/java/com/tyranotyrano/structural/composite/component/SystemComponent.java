package com.tyranotyrano.structural.composite.component;

public abstract class SystemComponent {
    protected static final String DEPTH_SIGN = ">";
    protected static final String TAB_SPACE = "    ";
    protected static final StringBuilder depthSignBuilder = new StringBuilder();

    protected String name;

    protected SystemComponent(String name) {
        this.name = name;
    }

    public String createDepthSign(int depth) {
        depthSignBuilder.setLength(0);

        if (depth == 0) {
            return "";
        }

        return depthSignBuilder.append(TAB_SPACE.repeat(Math.max(0, depth)))
                               .append(DEPTH_SIGN).toString();
    }

    public abstract void print(int depth);
}
