package me.yonatan.tags.component;

import javax.faces.component.UIComponentBase;

import me.yonatan.tags.renderkit.html.HelloWorldRenderer;

import org.richfaces.cdk.annotations.JsfComponent;
import org.richfaces.cdk.annotations.JsfRenderer;
import org.richfaces.cdk.annotations.Tag;

@JsfComponent(family = AbstractHelloWorld.COMPONENT_FAMILY, type = AbstractHelloWorld.COMPONENT_TYPE, tag = @Tag(name = AbstractHelloWorld.TAG_NAME), renderer = @JsfRenderer(type = HelloWorldRenderer.RENDERER_TYPE))
public abstract class AbstractHelloWorld extends UIComponentBase {
	public static final String COMPONENT_TYPE = "HelloWorld";
	public static final String COMPONENT_FAMILY = "HelloWorld";
	public static final String TAG_NAME = "helloWorld";

}
