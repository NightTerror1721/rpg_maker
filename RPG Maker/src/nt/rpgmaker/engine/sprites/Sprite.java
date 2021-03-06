/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nt.rpgmaker.engine.sprites;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;


public abstract class Sprite<A extends Sprite<A>>
{
    private String tag = null;
    
    public abstract int width();
    public abstract int height();
    
    public abstract void update(double delta);
    public abstract void draw(Graphics2D g, AffineTransform transf);
    
    public abstract boolean isAnimatedSprite();
    public abstract boolean isMultiSprite();
    public abstract boolean isStaticSprite();
    public abstract boolean isAnimation();
    
    public abstract Sprite duplicate();
    
    public abstract SpriteKind kind();
    
    public enum SpriteKind { STATIC, ANIMATED, MULTI, ANIMATION }
    
    /*Default methods*/
    
    public final void draw(Graphics2D g, float x, float y, float w, float h)
    {
        AffineTransform af = new AffineTransform();
        af.translate(x,y);
        af.scale(w/width(),h/height());
        draw(g,af);
    }
    
    public final void draw(Graphics2D g, FlipMode flip, float x, float y, float w, float h)
    {
        AffineTransform af = new AffineTransform();
        switch(flip)
        {
            case HORIZONTAL:
                af.translate(x+w,y);
                af.scale(-w/width(),h/height());
                break;
            case VERTICAL:
                af.translate(x,y+h);
                af.scale(w/width(),-h/height());
                break;
            case BOTH:
                af.translate(x+w,y+h);
                af.scale(-w/width(),-h/height());
                break;
        }
        draw(g,af);
    }
    
    public final void draw(Graphics2D g, int x, int y, int w, int h)
    {
        AffineTransform af = new AffineTransform();
        af.translate(x,y);
        af.scale((float)w/width(),(float)h/height());
        draw(g,af);
    }
    
    public final void draw(Graphics2D g, FlipMode flip, int x, int y, int w, int h)
    {
        AffineTransform af = new AffineTransform();
        switch(flip)
        {
            case HORIZONTAL:
                af.translate(x+w,y);
                af.scale(-w/width(),h/height());
                break;
            case VERTICAL:
                af.translate(x,y+h);
                af.scale(w/width(),-h/height());
                break;
            case BOTH:
                af.translate(x+w,y+h);
                af.scale(-w/width(),-h/height());
                break;
        }
        draw(g,af);
    }
    
    public final void draw(Graphics2D g, double x, double y, double w, double h)
    {
        AffineTransform af = new AffineTransform();
        af.translate(x,y);
        af.scale(w/width(),h/height());
        draw(g,af);
    }
    
    public final void draw(Graphics2D g, FlipMode flip, double x, double y, double w, double h)
    {
        AffineTransform af = new AffineTransform();
        switch(flip)
        {
            case HORIZONTAL:
                af.translate(x+w,y);
                af.scale(-w/width(),h/height());
                break;
            case VERTICAL:
                af.translate(x,y+h);
                af.scale(w/width(),-h/height());
                break;
            case BOTH:
                af.translate(x+w,y+h);
                af.scale(-w/width(),-h/height());
                break;
        }
        draw(g,af);
    }
    
    public final void draw(Graphics2D g, float x, float y, float w, float h, float rotationRadians)
    {
        AffineTransform af = new AffineTransform();
        af.translate(x,y);
        af.rotate(rotationRadians,w/2,h/2);
        af.scale(w/width(),h/height());
        draw(g,af);
    }
    
    public final void draw(Graphics2D g, FlipMode flip, float x, float y, float w, float h, float rotationRadians)
    {
        AffineTransform af = new AffineTransform();
        switch(flip)
        {
            case HORIZONTAL:
                af.translate(x+w,y);
                af.rotate(rotationRadians,w/2,h/2);
                af.scale(-w/width(),h/height());
                break;
            case VERTICAL:
                af.translate(x,y+h);
                af.rotate(rotationRadians,w/2,h/2);
                af.scale(w/width(),-h/height());
                break;
            case BOTH:
                af.translate(x+w,y+h);
                af.rotate(rotationRadians,w/2,h/2);
                af.scale(-w/width(),-h/height());
                break;
        }
        draw(g,af);
    }
    
    public final void draw(Graphics2D g, int x, int y, int w, int h, float rotationRadians)
    {
        AffineTransform af = new AffineTransform();
        af.translate(x,y);
        af.rotate(rotationRadians,w/2,h/2);
        af.scale((float)w/width(),(float)h/height());
        draw(g,af);
    }
    
    public final void draw(Graphics2D g, FlipMode flip, int x, int y, int w, int h, float rotationRadians)
    {
        AffineTransform af = new AffineTransform();
        switch(flip)
        {
            case HORIZONTAL:
                af.translate(x+w,y);
                af.rotate(rotationRadians,w/2,h/2);
                af.scale(-w/width(),h/height());
                break;
            case VERTICAL:
                af.translate(x,y+h);
                af.rotate(rotationRadians,w/2,h/2);
                af.scale(w/width(),-h/height());
                break;
            case BOTH:
                af.translate(x+w,y+h);
                af.rotate(rotationRadians,w/2,h/2);
                af.scale(-w/width(),-h/height());
                break;
        }
        draw(g,af);
    }
    
    public final void draw(Graphics2D g, float x, float y, float w, float h, double rotationRadians)
    {
        AffineTransform af = new AffineTransform();
        af.translate(x,y);
        af.rotate(rotationRadians,w/2,h/2);
        af.scale(w/width(),h/height());
        draw(g,af);
    }
    
    public final void draw(Graphics2D g, FlipMode flip, float x, float y, float w, float h, double rotationRadians)
    {
        AffineTransform af = new AffineTransform();
        switch(flip)
        {
            case HORIZONTAL:
                af.translate(x+w,y);
                af.rotate(rotationRadians,w/2,h/2);
                af.scale(-w/width(),h/height());
                break;
            case VERTICAL:
                af.translate(x,y+h);
                af.rotate(rotationRadians,w/2,h/2);
                af.scale(w/width(),-h/height());
                break;
            case BOTH:
                af.translate(x+w,y+h);
                af.rotate(rotationRadians,w/2,h/2);
                af.scale(-w/width(),-h/height());
                break;
        }
        draw(g,af);
    }
    
    public final void draw(Graphics2D g, int x, int y, int w, int h, double rotationRadians)
    {
        AffineTransform af = new AffineTransform();
        af.translate(x,y);
        af.rotate(rotationRadians,w/2,h/2);
        af.scale((float)w/width(),(float)h/height());
        draw(g,af);
    }
    
    public final void draw(Graphics2D g, FlipMode flip, int x, int y, int w, int h, double rotationRadians)
    {
        AffineTransform af = new AffineTransform();
        switch(flip)
        {
            case HORIZONTAL:
                af.translate(x+w,y);
                af.rotate(rotationRadians,w/2,h/2);
                af.scale(-w/width(),h/height());
                break;
            case VERTICAL:
                af.translate(x,y+h);
                af.rotate(rotationRadians,w/2,h/2);
                af.scale(w/width(),-h/height());
                break;
            case BOTH:
                af.translate(x+w,y+h);
                af.rotate(rotationRadians,w/2,h/2);
                af.scale(-w/width(),-h/height());
                break;
        }
        draw(g,af);
    }
    
    public final void draw(Graphics2D g, double x, double y, double w, double h, double rotationRadians)
    {
        AffineTransform af = new AffineTransform();
        af.translate(x,y);
        af.rotate(rotationRadians,w/2,h/2);
        af.scale(w/width(),h/height());
        draw(g,af);
    }
    
    public final void draw(Graphics2D g, FlipMode flip, double x, double y, double w, double h, double rotationRadians)
    {
        AffineTransform af = new AffineTransform();
        switch(flip)
        {
            case HORIZONTAL:
                af.translate(x+w,y);
                af.rotate(rotationRadians,w/2,h/2);
                af.scale(-w/width(),h/height());
                break;
            case VERTICAL:
                af.translate(x,y+h);
                af.rotate(rotationRadians,w/2,h/2);
                af.scale(w/width(),-h/height());
                break;
            case BOTH:
                af.translate(x+w,y+h);
                af.rotate(rotationRadians,w/2,h/2);
                af.scale(-w/width(),-h/height());
                break;
        }
        draw(g,af);
    }
    
    public final void setSpriteTag(String tag) { this.tag = tag; }
    public final String getSpriteTag() { return tag; }
    
    public enum FlipMode { VERTICAL, HORIZONTAL, BOTH; }
}
