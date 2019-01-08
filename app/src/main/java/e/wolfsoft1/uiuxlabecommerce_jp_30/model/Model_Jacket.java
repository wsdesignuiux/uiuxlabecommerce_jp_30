package e.wolfsoft1.uiuxlabecommerce_jp_30.model;

public class Model_Jacket {
    private final String jacket_description;
    private final Integer jacket_image;
    private final String jacket_price;
    private final String jacket_type;

    public Model_Jacket(Integer jacket_image, String jacket_price, String jacket_type, String jacket_description) {
        this.jacket_description=jacket_description;
        this.jacket_image=jacket_image;
        this.jacket_price=jacket_price;
        this.jacket_type=jacket_type;
    }

    public String getJacket_description() {
        return jacket_description;
    }

    public Integer getJacket_image() {
        return jacket_image;
    }

    public String getJacket_price() {
        return jacket_price;
    }

    public String getJacket_type() {
        return jacket_type;
    }
}
