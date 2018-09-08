namespace java com.xueershangda.tianxun.user.service

include "user.thrift"

service UserService {
    /**
     * 根据params所携带条件删除数据，条件是等于，且是and关系。
     * @param params 删除条件
     *
     * @return 被删除的记录数
     */
    i32 deleteBatch(1: user.User params);

    /**
     * 根据主键删除记录。
     * @param id 主键id
     * @return 被删除的记录数，应该是1或者0
     */
    i32 deleteById(1: string id);

    /**
     * 插入记录，只有非空字段才会插入到数据库。
     * @param record 要被保存的数据
     *
     * @return 保存的记录数，成功时1，失败时0
     */
    i32 save(1: user.User record);

    /**
     * 根据params所携带条件查询数据，条件是等于，且是and关系。
     * @param params 查询条件
     *
     * @return 查询到实体list
     */
    list<user.User> queryForList(1: user.User params);

    /**
     * 根据params所携带条件分页查询数据，条件是等于，且是and关系。
     * @param params 查询条件
     *
     * @return 查询到实体list
     */
    list<user.User> queryForPage(1: user.User params);

    /**
     * 根据主键查询数据。
     * @param id 主键
     *
     * @return 单个实体
     */
    user.User find(1: string id);

    /**
     * 根据params所携带条件查询唯一记录，条件是等于，且是and关系。
     * @param params 查询条件
     * @return 查询的实体
     */
    user.User unique(1: user.User params);

    /**
     * 根据params所携带条件更新指定字段，条件是等于，且是and关系。
     * @param record 要更新的数据
     * @param params update的where条件
     *
     * @return 被更新的记录数
     */
    i32 updateBatch(1: user.User record, 2: user.User params);

    /**
     * 根据主键更新指定字段的数据。
     * @param record 要更新的数据，含有Id
     *
     * @return 被更新的记录数，应该是1或者0
     */
    i32 updateById(1: user.User record);
}