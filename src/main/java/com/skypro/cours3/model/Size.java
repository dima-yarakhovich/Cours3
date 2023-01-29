package com.skypro.cours3.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Size {

//    SMALL_36, LITTLE_38, MIDDLE_40, BIG_43;

    SMALL_36("36"),
    LITTLE_38("38"),
    MIDDLE_40("40"),
    BIG_43("43");

    private final String bySize;

    Size(String bySize) {
        this.bySize = bySize;
    }

    @JsonValue
    public String getBySize() {
        return bySize;
    }

//    @JsonCreator
//    public static Size fromBySize(int bySize) {
//        for (Size type : Size.values()) {
//            if (type.bySize.equals(bySize)) {
//                return type;
//            }
//        }
//        return null;
//    }
//    @JsonValue
//    public int getSize(Size size) {
//        {
//            switch (size) {
//                case SMALL_36:
//                    return 36;
//                case LITTLE_38:
//                    return 38;
//                case MIDDLE_40:
//                    return 40;
//                case BIG_43:
//                    return 43;
//            }
//        }
//        return 0;
//    }
////

}
