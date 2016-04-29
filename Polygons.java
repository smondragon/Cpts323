/*
 * Copyright (C) 2012 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */

package groupProject;

import gov.nasa.worldwind.WorldWind;
import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.geom.Position;
import gov.nasa.worldwind.layers.RenderableLayer;
import gov.nasa.worldwind.render.*;
import gov.nasa.worldwind.util.BasicDragger;
import gov.nasa.worldwindx.examples.ApplicationTemplate;

import java.util.ArrayList;

/**
 * Example of {@link Polygon} usage. Sets material, opacity and other attributes. Sets rotation and other properties.
 * Adds an image for texturing. Shows a dateline-spanning Polygon.
 *
 * @author tag
 * @version $Id: Polygons.java 1171 2013-02-11 21:45:02Z dcollins $
 */
public class Polygons extends ApplicationTemplate
{
    public static class AppFrame extends ApplicationTemplate.AppFrame
    {
        public AppFrame()
        {
            super(true, true, false);

            RenderableLayer layer = new RenderableLayer();

            // Create and set an attribute bundle.
            ShapeAttributes normalAttributes = new BasicShapeAttributes();
            normalAttributes.setInteriorMaterial(Material.YELLOW);
            normalAttributes.setOutlineOpacity(1);
            normalAttributes.setInteriorOpacity(1);
            normalAttributes.setOutlineMaterial(Material.GREEN);
            normalAttributes.setOutlineWidth(2);
            normalAttributes.setDrawOutline(true);
            normalAttributes.setDrawInterior(true);
            normalAttributes.setEnableLighting(true);

            ShapeAttributes highlightAttributes = new BasicShapeAttributes(normalAttributes);
            highlightAttributes.setOutlineMaterial(Material.WHITE);
            highlightAttributes.setOutlineOpacity(1);

            // Create a polygon, set some of its properties and set its attributes.
            ArrayList<Position> pathPositions = new ArrayList<Position>();
            
            
            
            pathPositions.add(Position.fromDegrees(38.56, -87.23, 1000));
            pathPositions.add(Position.fromDegrees(38.53, -87.29, 1000));
            pathPositions.add(Position.fromDegrees(38.55, -87.36, 1000));
            pathPositions.add(Position.fromDegrees(38.54, -87.44, 1000));
            pathPositions.add(Position.fromDegrees(38.51, -87.44, 1000));
            pathPositions.add(Position.fromDegrees(38.5, -87.29, 1000));
            pathPositions.add(Position.fromDegrees(38.52, -87.22, 1000));
            pathPositions.add(Position.fromDegrees(38.56, -87.23, 1000));
            
            // first actual polygon
            Polygon pgon = new Polygon(pathPositions);
            pgon.setValue(AVKey.DISPLAY_NAME, "Dummy Data\nFlood Warning");
            //
 
            
            pathPositions.clear();
            
            pathPositions.add(Position.fromDegrees(38.56, -87.23));
            pathPositions.add(Position.fromDegrees(38.53, -87.29));
            pathPositions.add(Position.fromDegrees(38.55, -87.36));
            pathPositions.add(Position.fromDegrees(38.54, -87.44));
            pathPositions.add(Position.fromDegrees(38.51, -87.44));
            pathPositions.add(Position.fromDegrees(38.5, -87.29));
            pathPositions.add(Position.fromDegrees(38.52, -87.22));
            pathPositions.add(Position.fromDegrees(38.56, -87.23));
     
            
            pgon.addInnerBoundary(pathPositions);
            pgon.setAltitudeMode(WorldWind.RELATIVE_TO_GROUND);
            pgon.setAttributes(normalAttributes);
            pgon.setHighlightAttributes(highlightAttributes);
            layer.addRenderable(pgon);

            ArrayList<Position> pathLocations = new ArrayList<Position>();
            pathLocations.add(Position.fromDegrees(38.54, -87.44, 1000));
            pathLocations.add(Position.fromDegrees(38.52, -87.55, 1000));
            pathLocations.add(Position.fromDegrees(38.43, -87.73, 1000));
            pathLocations.add(Position.fromDegrees(38.41, -87.73, 1000));
            pathLocations.add(Position.fromDegrees(38.44, -87.6, 1000));
            pathLocations.add(Position.fromDegrees(38.51, -87.44, 1000));
            pathLocations.add(Position.fromDegrees(38.54, -87.44, 1000));
            
           
            // a new one
            pgon = new Polygon(pathLocations);
            pgon.setValue(AVKey.DISPLAY_NAME, "Dummy data 2:\nElectric Boogaloo");
            normalAttributes = new BasicShapeAttributes(normalAttributes);
            normalAttributes.setDrawInterior(true);
            normalAttributes.setInteriorMaterial(Material.YELLOW);
            normalAttributes.setInteriorOpacity(1);
            pgon.setAttributes(normalAttributes);
            pgon.setHighlightAttributes(highlightAttributes);
            layer.addRenderable(pgon);
            pathLocations.clear();
            /*
            pathLocations.add(Position.fromDegrees(38.54, -87.44));
            pathLocations.add(Position.fromDegrees(38.52, -87.55));
            pathLocations.add(Position.fromDegrees(38.43, -87.73));
            pathLocations.add(Position.fromDegrees(38.41, -87.73));
            pathLocations.add(Position.fromDegrees(38.44, -87.6));
            pathLocations.add(Position.fromDegrees(38.51, -87.44));
            pathLocations.add(Position.fromDegrees(38.54, -87.44));
            */
         
   

            // Add the layer to the model.
            insertBeforeCompass(getWwd(), layer);

            // Update layer panel
            this.getLayerPanel().update(this.getWwd());
        }
    }

    //TODO: Remove main
    public static void main(String[] args)
    {
    	// 
        ApplicationTemplate.start("Test test test", AppFrame.class);
    }
}
