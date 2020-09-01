package com.beeb.myspringboot.bean;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * <dl>
 * <dd>CreateDate: 2020/7/27</dd>
 * </dl>
 *
 * @author lzh
 */
@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public static enum Type{
        WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
    }
}
