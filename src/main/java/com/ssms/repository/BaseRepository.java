package com.ssms.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

/**
 * @Author liuxuke
 * @Title: BaseRepository
 * @ProjectName smms
 * @Description: //TODO
 * @date 2018/10/11 17:51
 */
@NoRepositoryBean
public interface BaseRepository<T,I extends Serializable> extends PagingAndSortingRepository<T,I>, JpaSpecificationExecutor<T> {

}
