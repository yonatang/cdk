package me.yonatan.tags.renderkit.html;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.Renderer;

import me.yonatan.tags.component.AbstractHelloWorld;

import org.richfaces.cdk.annotations.JsfRenderer;

@JsfRenderer(family = AbstractHelloWorld.COMPONENT_FAMILY, type = HelloWorldRenderer.RENDERER_TYPE)
public class HelloWorldRenderer extends Renderer {
	public static final String RENDERER_TYPE = "me.yonatan.tags.HelloWorldRenderer";

	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
		if (!(component.isRendered() && component instanceof AbstractHelloWorld))
			return;

		AbstractHelloWorld newButton = (AbstractHelloWorld) component;

		ResponseWriter writer = context.getResponseWriter();
		writer.startElement("div", newButton);
		writer.write("hello, world!");
		writer.endElement("div");
	}
}
