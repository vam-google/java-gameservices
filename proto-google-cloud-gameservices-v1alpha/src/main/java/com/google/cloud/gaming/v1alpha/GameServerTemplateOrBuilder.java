/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1alpha/game_server_deployments.proto

package com.google.cloud.gaming.v1alpha;

public interface GameServerTemplateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1alpha.GameServerTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The description of the game server template.
   * </pre>
   *
   * <code>string description = 1;</code>
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The description of the game server template.
   * </pre>
   *
   * <code>string description = 1;</code>
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The game server spec, which is sent to Agones.
   * </pre>
   *
   * <code>string spec = 2;</code>
   */
  java.lang.String getSpec();
  /**
   *
   *
   * <pre>
   * The game server spec, which is sent to Agones.
   * </pre>
   *
   * <code>string spec = 2;</code>
   */
  com.google.protobuf.ByteString getSpecBytes();

  /**
   *
   *
   * <pre>
   * Output only. The percentage of game servers running this game server
   * template in the selected clusters.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gaming.v1alpha.ClusterPercentageSelector cluster_percentage_selectors = 3;
   * </code>
   */
  java.util.List<com.google.cloud.gaming.v1alpha.ClusterPercentageSelector>
      getClusterPercentageSelectorsList();
  /**
   *
   *
   * <pre>
   * Output only. The percentage of game servers running this game server
   * template in the selected clusters.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gaming.v1alpha.ClusterPercentageSelector cluster_percentage_selectors = 3;
   * </code>
   */
  com.google.cloud.gaming.v1alpha.ClusterPercentageSelector getClusterPercentageSelectors(
      int index);
  /**
   *
   *
   * <pre>
   * Output only. The percentage of game servers running this game server
   * template in the selected clusters.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gaming.v1alpha.ClusterPercentageSelector cluster_percentage_selectors = 3;
   * </code>
   */
  int getClusterPercentageSelectorsCount();
  /**
   *
   *
   * <pre>
   * Output only. The percentage of game servers running this game server
   * template in the selected clusters.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gaming.v1alpha.ClusterPercentageSelector cluster_percentage_selectors = 3;
   * </code>
   */
  java.util.List<? extends com.google.cloud.gaming.v1alpha.ClusterPercentageSelectorOrBuilder>
      getClusterPercentageSelectorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The percentage of game servers running this game server
   * template in the selected clusters.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gaming.v1alpha.ClusterPercentageSelector cluster_percentage_selectors = 3;
   * </code>
   */
  com.google.cloud.gaming.v1alpha.ClusterPercentageSelectorOrBuilder
      getClusterPercentageSelectorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The ID of the game server template, specified by the user.
   * </pre>
   *
   * <code>string template_id = 4;</code>
   */
  java.lang.String getTemplateId();
  /**
   *
   *
   * <pre>
   * The ID of the game server template, specified by the user.
   * </pre>
   *
   * <code>string template_id = 4;</code>
   */
  com.google.protobuf.ByteString getTemplateIdBytes();
}
