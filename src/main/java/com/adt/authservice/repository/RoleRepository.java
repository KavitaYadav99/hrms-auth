/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.adt.authservice.repository;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adt.authservice.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	@Query(value="select * from role where role_name=:roleName", nativeQuery = true)
	public Optional<Role> findByRoleName(String roleName);
	
	public Set<Role> findByDefaultRole(boolean defaultrole);

	public void deleteByRole(String role);
}
