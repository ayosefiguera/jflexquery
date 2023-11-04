package me.afiguera.core.convert;

import org.apache.commons.lang3.StringUtils;

public class QueryConvert {

    public String toFlexibleSearch(){
        // select {p.pk} from {product as p} where {p.code} = 1234
        return StringUtils.EMPTY;
    }

    public String toJavaQuery(){
        // "Select {" + product.pk + "} where {" + Product.Type + " as  p} where {" + Product.CODE + "} = " + Product.CODE +"?
        return StringUtils.EMPTY;
    }
}
