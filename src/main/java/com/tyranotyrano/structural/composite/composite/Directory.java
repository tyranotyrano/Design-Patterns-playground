package com.tyranotyrano.structural.composite.composite;

import java.util.ArrayList;
import java.util.List;

import com.tyranotyrano.structural.composite.component.SystemComponent;

public class Directory extends SystemComponent {
    private List<SystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void add(SystemComponent component) {
        children.add(component);
    }

    public void remove(SystemComponent component) {
        children.remove(component);
    }

    @Override
    public void print(int depth) {
        System.out.print(createDepthSign(depth));
        System.out.println("[폴더] " + name);

        for (SystemComponent component : children) {
            component.print(depth + 1);
        }
    }
}
