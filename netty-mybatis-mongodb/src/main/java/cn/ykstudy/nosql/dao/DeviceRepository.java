package cn.ykstudy.nosql.dao;

import cn.ykstudy.nosql.entity.Device;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeviceRepository extends MongoRepository<Device, Long> {
}
