package com.codingadvanced.ex8;

public class ValidatorImpl implements Validator<Parcel> {

    /**
     * The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300,
     * * whether each size is not less than 30,
     * * whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true.
     * * In case of errors, it should inform the user about them.
     *
     * @param parcel
     * @return
     */
    @Override
    public boolean Validate(Parcel parcel) {
        int dimensionsSum = parcel.getxLength() +
                parcel.getyLength() +
                parcel.getzLength();
        if (dimensionsSum > 300) {
            System.out.println("invalid parcel - too big");
            return false;
        }
        if (parcel.getxLength() < 30 || parcel.getyLength() < 30 || parcel.getzLength() < 30) {
            System.out.println("invalid dimensions");
            return false;
        }
        if (parcel.isExpress && parcel.getWeight()>15){
            System.out.println("weight is to big for express package");
            return false;
        }
        if (!parcel.isExpress && parcel.getWeight()>30){
            System.out.println("weight is to big regular package");
            return false;
        }
        return true;
    }
}
