
package com.eli.calc.shape.service.ws.parms;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.eli.calc.shape.model.CalcType;
import com.eli.calc.shape.model.ShapeName;


@XmlRootElement
public class QueueCalculationParms {

	@XmlElement(required=true)
    protected ShapeName shapeName;
	@XmlElement(required=true)
    protected CalcType calcType;
	@XmlElement(required=true)
    protected double dimension;

    public ShapeName getShapeName() {
        return shapeName;
    }

    public void setShapeName(ShapeName value) {
        this.shapeName = value;
    }

    public CalcType getCalcType() {
        return calcType;
    }

    public void setCalcType(CalcType value) {
        this.calcType = value;
    }

    public double getDimension() {
        return dimension;
    }

    public void setDimension(double value) {
        this.dimension = value;
    }

}
