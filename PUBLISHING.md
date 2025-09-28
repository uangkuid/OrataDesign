# Publishing to Maven Central

This document explains how to set up and publish the Orata Design System to Maven Central.

## Prerequisites

### 1. Sonatype OSSRH Account

1. Create an account at [OSSRH](https://issues.sonatype.org/secure/Signup!default.jspa)
2. Create a JIRA ticket to request a new project namespace: `com.oratakashi`
3. Wait for approval (usually takes 1-2 business days)

### 2. GPG Key Setup

Generate a GPG key for signing artifacts:

```bash
# Generate key
gpg --gen-key

# List keys to get the key ID
gpg --list-secret-keys --keyid-format LONG

# Export the private key
gpg --export-secret-keys -a YOUR_KEY_ID > private-key.asc

# Upload public key to key servers
gpg --send-keys YOUR_KEY_ID --keyserver keyserver.ubuntu.com
gpg --send-keys YOUR_KEY_ID --keyserver keys.openpgp.org
```

## Local Setup

### 1. Configure gradle.properties

Add these properties to your local `~/.gradle/gradle.properties`:

```properties
# Sonatype credentials
ossrhUsername=your-sonatype-username
ossrhPassword=your-sonatype-password

# GPG signing
signing.keyId=YOUR_8_DIGIT_KEY_ID
signing.password=your-gpg-passphrase
signing.secretKeyRingFile=/path/to/your/secring.gpg
```

### 2. Test Local Publishing

```bash
# Build and publish to local Maven repository
./gradlew :design-system:publishToMavenLocal

# Verify the artifacts were created
ls ~/.m2/repository/com/oratakashi/orata-design/
```

## GitHub Actions Setup

### Required Secrets

Set up these secrets in your GitHub repository (Settings → Secrets and variables → Actions):

| Secret Name | Description | How to get |
|-------------|-------------|------------|
| `OSSRH_USERNAME` | Sonatype username | From your OSSRH account |
| `OSSRH_PASSWORD` | Sonatype password | From your OSSRH account |
| `GPG_PRIVATE_KEY` | GPG private key | `gpg --export-secret-keys -a YOUR_KEY_ID` |
| `GPG_PASSPHRASE` | GPG passphrase | The passphrase you set when creating the key |
| `SIGNING_KEY_ID` | GPG key ID | Last 8 digits of your key ID |
| `SIGNING_PASSWORD` | GPG signing password | Same as GPG_PASSPHRASE |

### Triggering a Release

There are two ways to publish:

#### 1. Manual Release (Recommended)

1. Go to Actions → "Publish to Maven Central"
2. Click "Run workflow"
3. Enter the version number (e.g., `1.0.0`)
4. Click "Run workflow"

#### 2. Tag-based Release

```bash
# Create and push a tag
git tag v1.0.0
git push origin v1.0.0
```

## Release Process

1. **Staging**: Artifacts are uploaded to staging repository
2. **Validation**: Sonatype validates the artifacts
3. **Release**: Artifacts are promoted to Maven Central
4. **Sync**: Takes 10-30 minutes to sync to Maven Central

## Troubleshooting

### Common Issues

1. **GPG Signing Fails**
   - Ensure the private key is correctly formatted
   - Check that the passphrase is correct
   - Verify the key ID matches

2. **Sonatype Authentication Fails**
   - Verify username and password
   - Check if your namespace is approved

3. **Validation Errors**
   - Ensure all required POM metadata is present
   - Check that sources and javadoc JARs are included
   - Verify artifact signing

### Useful Commands

```bash
# Check what will be published
./gradlew :design-system:publishToMavenLocal --dry-run

# Build all artifacts
./gradlew :design-system:build

# Sign artifacts manually
./gradlew :design-system:signKotlinMultiplatformPublication

# Publish to staging (without auto-release)
./gradlew :design-system:publishToSonatype
```

## Version Management

The project uses semantic versioning:

- `1.0.0-alpha01` - Alpha releases for testing
- `1.0.0-beta01` - Beta releases for wider testing  
- `1.0.0` - Stable releases
- `1.0.1` - Patch releases

### Updating Version

Update the version in `design-system/build.gradle.kts`:

```kotlin
version = "1.0.0-beta01"
```

## Monitoring

After publishing, monitor:

1. [Sonatype Repository Manager](https://s01.oss.sonatype.org/) - Check staging status
2. [Maven Central](https://search.maven.org/search?q=g:com.oratakashi) - Verify public availability
3. GitHub Releases - Automated release notes

## Support

For issues with:
- **Sonatype/OSSRH**: [Sonatype JIRA](https://issues.sonatype.org)
- **Maven Central**: [Maven Central Support](https://central.sonatype.org/support/)
- **This Setup**: Create an issue in this repository