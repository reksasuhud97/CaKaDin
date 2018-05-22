package lokadin.sandy.example.com.lokadin;


public class Place {

    private int _id;
    private String _description;

    public Place(){}

    public Place(String description) {
        this._description = description;
    }

    public int get_id() {
        return _id;
    }

    public String get_description() {
        return _description;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_description(String _description) {
        this._description = _description;
    }
}
