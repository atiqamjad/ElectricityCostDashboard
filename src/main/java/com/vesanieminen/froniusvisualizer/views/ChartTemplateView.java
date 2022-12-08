package com.vesanieminen.froniusvisualizer.views;

import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.Route;
import com.vesanieminen.froniusvisualizer.components.ChartTemplate;

@Route(value = "pylvasgraafi", layout = MainLayout.class)
public class ChartTemplateView extends Main {

    public ChartTemplateView() {
        setHeight("var(--chart-template-height)");
        setMinHeight("300px");
        add(new ChartTemplate());
    }

}
