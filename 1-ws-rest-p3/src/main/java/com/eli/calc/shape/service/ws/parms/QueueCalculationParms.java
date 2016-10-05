
package com.eli.calc.shape.service.ws.parms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.eli.calc.shape.model.CalcType;
import com.eli.calc.shape.model.ShapeName;


@XmlRootElement(name="QueueCalculationParms")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"shapeName", "calcType", "dimension"})
public class QueueCalculationParms {

	@XmlElement(name="shapeName", required=true)
    private ShapeName shapeName;
	@XmlElement(name="calcType", required=true)
    private CalcType calcType;
	@XmlElement(name="dimension", required=true)
    private double dimension;

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
