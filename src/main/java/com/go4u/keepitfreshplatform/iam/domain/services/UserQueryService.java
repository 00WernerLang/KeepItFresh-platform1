package com.go4u.keepitfreshplatform.iam.domain.services;
import com.go4u.keepitfreshplatform.iam.domain.model.aggregates.User;
import com.go4u.keepitfreshplatform.iam.domain.model.queries.GetAllUsersQuery;
import com.go4u.keepitfreshplatform.iam.domain.model.queries.GetUserByIdQuery;
import com.go4u.keepitfreshplatform.iam.domain.model.queries.GetUserByUsernameQuery;

import java.util.List;
import java.util.Optional;

public interface UserQueryService {
    List<User> handle(GetAllUsersQuery query);

    Optional<User> handle(GetUserByIdQuery query);

    Optional<User> handle(GetUserByUsernameQuery query);

}
