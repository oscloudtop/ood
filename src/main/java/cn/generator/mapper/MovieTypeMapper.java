package cn.generator.mapper;

import cn.generator.pojo.MovieType;

public interface MovieTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movie_type
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Short tId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movie_type
     *
     * @mbggenerated
     */
    int insert(MovieType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movie_type
     *
     * @mbggenerated
     */
    int insertSelective(MovieType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movie_type
     *
     * @mbggenerated
     */
    MovieType selectByPrimaryKey(Short tId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movie_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MovieType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table movie_type
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MovieType record);
}