package com.wiryadev.binar_movie_compose.data.repositories.tv

import androidx.paging.PagingData
import com.wiryadev.binar_movie_compose.data.local.entity.TvEntity
import com.wiryadev.binar_movie_compose.data.remote.Result
import com.wiryadev.binar_movie_compose.data.remote.tv.dto.DetailTvResponse
import com.wiryadev.binar_movie_compose.data.remote.tv.dto.TvDto
import kotlinx.coroutines.flow.Flow

interface TvRepository {

    fun discoverTvShows(): Flow<PagingData<TvDto>>

    fun getTvShowDetail(tvId: Int): Flow<Result<DetailTvResponse>>

    fun getFavoriteTvs(): Flow<List<TvEntity>>

    fun checkFavoriteTv(id: Int): Flow<Int>

    suspend fun addFavoriteTv(tv: TvEntity)

    suspend fun deleteFavoriteTv(tv: TvEntity)

}