package cn.edu.ustb.dm.model;

public class BookTagRelation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_tag_relation.BOOK_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    private Integer BOOK_ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_tag_relation.TAG_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    private Integer TAG_ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_tag_relation.USEAGE_NUM
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    private Integer USEAGE_NUM;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_tag_relation.BOOK_ID
     *
     * @return the value of book_tag_relation.BOOK_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public Integer getBOOK_ID() {
        return BOOK_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_tag_relation.BOOK_ID
     *
     * @param BOOK_ID the value for book_tag_relation.BOOK_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public void setBOOK_ID(Integer BOOK_ID) {
        this.BOOK_ID = BOOK_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_tag_relation.TAG_ID
     *
     * @return the value of book_tag_relation.TAG_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public Integer getTAG_ID() {
        return TAG_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_tag_relation.TAG_ID
     *
     * @param TAG_ID the value for book_tag_relation.TAG_ID
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public void setTAG_ID(Integer TAG_ID) {
        this.TAG_ID = TAG_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_tag_relation.USEAGE_NUM
     *
     * @return the value of book_tag_relation.USEAGE_NUM
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public Integer getUSEAGE_NUM() {
        return USEAGE_NUM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_tag_relation.USEAGE_NUM
     *
     * @param USEAGE_NUM the value for book_tag_relation.USEAGE_NUM
     *
     * @mbggenerated Sun May 19 11:22:56 CST 2013
     */
    public void setUSEAGE_NUM(Integer USEAGE_NUM) {
        this.USEAGE_NUM = USEAGE_NUM;
    }
}