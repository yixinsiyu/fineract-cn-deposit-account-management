/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.mifos.deposit.service.internal.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shed_currencies")
public class CurrencyEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;
  @OneToOne
  @JoinColumn(name = "product_definition_id", nullable = false, unique = true)
  private ProductDefinitionEntity productDefinition;
  @Column(name = "a_code", nullable = false)
  private String code;
  @Column(name = "a_name", nullable = false)
  private String name;
  @Column(name = "sign", nullable = false)
  private String sign;
  @Column(name = "scale", nullable = false)
  private Integer scale;

  public CurrencyEntity() {
    super();
  }

  public Long getId() {
    return this.id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public ProductDefinitionEntity getProductDefinition() {
    return this.productDefinition;
  }

  public void setProductDefinition(final ProductDefinitionEntity productDefinition) {
    this.productDefinition = productDefinition;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(final String code) {
    this.code = code;
  }

  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getSign() {
    return this.sign;
  }

  public void setSign(final String sign) {
    this.sign = sign;
  }

  public Integer getScale() {
    return this.scale;
  }

  public void setScale(final Integer scale) {
    this.scale = scale;
  }
}
