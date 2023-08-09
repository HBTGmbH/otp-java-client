package org.opentripplanner.client.model;

public enum ModeInput {
  TRANSIT("TRANSIT"),
  WALK("WALK"),
  RAIL("RAIL"),
  BUS("BUS"),
  SUBWAY("SUBWAY"),
  FERRY("FERRY"),
  SCOOTER_RENT("SCOOTER", "RENT"),
  BICYCLE_RENT("BICYCLE", "RENT"),
  FLEX_DIRECT("FLEX", "DIRECT"),
  FLEX_ACCESS("FLEX", "ACCESS"),
  FLEX_EGRESS("FLEX", "EGRESS");

  public final String mode;
  public final String qualifier;

  ModeInput(String mode) {
    this(mode, null);
  }

  ModeInput(String mode, String qualifier) {
    this.mode = mode;
    this.qualifier = qualifier;
  }
}