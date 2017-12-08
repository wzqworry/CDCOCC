package com.biierg.cocc.common.service;

import com.biierg.cocc.common.bean.CmsArticle;
import com.biierg.cocc.common.support.SrvException;

import java.util.List;

/**
 * Created by syy on 2017/8/26.
 */
public interface IBaseArticleService {
    /**
     * 获取某栏目下所有文章
     * @return
     */
    public List<CmsArticle> queryAllArticles(String colId) throws SrvException;

    /**
     * 为App提供文章查询接口：只展示已发布的文章
     * @param colId
     * @return
     */
    public List<CmsArticle> queryAppAllArticles(String colId) throws SrvException;

    public CmsArticle getCmsArticleById(String id) throws SrvException;

    /**
     * 根据关键字搜索文章
     * @param keyWork
     * @return
     */
    public List<CmsArticle> queryArticlesByKey(String keyWork) throws SrvException;

    /**
     * 删除文章
     * @param aid
     * @return
     */
    public boolean deleteArticle(String aid) throws SrvException;

    /**
     * 新增
     * @return
     */
    public boolean createArticle(String columnId,String title,String subTitle,
                                 String keyword,String summary,String content,String frontcover1,
                                 String frontcover2,String attachment,int isLocked,int isTop,
                                 int isComment, int status,int sortnum) throws SrvException;

    /**
     * 修改
     * @return
     */
    public boolean updateArticle(String id,String title, String subTitle,
                                 String keyword, String summary, String content,
                                 int status, int sortnum,String frontcover1,String frontcover2) throws SrvException;
}
